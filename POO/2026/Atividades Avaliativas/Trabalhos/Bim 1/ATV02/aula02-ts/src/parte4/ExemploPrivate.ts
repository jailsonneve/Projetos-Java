class ExemploPrivate {
    private senha: string = "123";
  
    // Só pode ser acessado DENTRO da própria classe
    mostrarSenha() {
      console.log(this.senha);
    }
  }