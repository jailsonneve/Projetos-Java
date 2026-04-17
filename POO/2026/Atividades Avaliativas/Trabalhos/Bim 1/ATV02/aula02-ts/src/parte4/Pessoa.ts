class Pessoa {
    constructor(public nome: string, public idade: number) {}
  
    apresentar() {
      console.log(this.nome, this.idade);
    }
  }