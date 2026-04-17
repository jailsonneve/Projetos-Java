class Televisao {
    private canal: number = 1;
  
    setCanal(canal: number) {
      // "canal" = parâmetro da função
      // "this.canal" = atributo da classe
  
      this.canal = canal;

      //O "this" serve para acessar o estado interno do objeto
    }
  
    getCanal(): number {
      return this.canal;
    }
  }

  