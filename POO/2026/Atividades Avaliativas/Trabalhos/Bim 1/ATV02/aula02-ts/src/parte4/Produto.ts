class Produto {
    constructor(
      public nome: string,
      public preco: number,
      public estoque: number
    ) {}
  
    adicionarEstoque(qtd: number) {
      if (qtd > 0) {
        this.estoque += qtd;
      }
    }
  
    removerEstoque(qtd: number) {
      if (qtd > 0 && qtd <= this.estoque) {
        this.estoque -= qtd;
      }
    }
  
    exibirProduto() {
      console.log(`Produto: ${this.nome}`);
      console.log(`Preço: ${this.preco}`);
      console.log(`Estoque: ${this.estoque}`);
    }
  }