class Temperatura {
    private _celsius: number = 0;
  
    get celsius(): number {
      return this._celsius;
    }
  
    set celsius(valor: number) {
      if (valor < -273.15) {
        console.log("Erro: temperatura abaixo do zero absoluto");
        return;
      }
  
      this._celsius = valor;
    }
  }