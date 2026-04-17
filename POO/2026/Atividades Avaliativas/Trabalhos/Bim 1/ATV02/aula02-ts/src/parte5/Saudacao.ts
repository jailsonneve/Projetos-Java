class Saudacao {
    // assinaturas (overload)
    exibir(nome: string): void;
    exibir(nome: string, titulo: string): void;
  
    // implementação real
    exibir(nome: string, titulo?: string): void {
      if (titulo) {
        console.log(`Olá, ${titulo} ${nome}!`);
      } else {
        console.log(`Olá, ${nome}!`);
      }
    }
  }
  
  // teste
  const s = new Saudacao();
  
  s.exibir("Arthur");
  s.exibir("Arthur", "Sr.");