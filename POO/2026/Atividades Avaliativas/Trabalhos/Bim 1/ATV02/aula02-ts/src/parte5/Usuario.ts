class Usuario {
    constructor(public nome: string) {}
  
    static criarVisitante(): Usuario {
      return new Usuario("Visitante");
    }
  }
  
  // teste
  const u1 = new Usuario("Arthur");
  const visitante = Usuario.criarVisitante();
  
  console.log(u1.nome);
  console.log(visitante.nome);