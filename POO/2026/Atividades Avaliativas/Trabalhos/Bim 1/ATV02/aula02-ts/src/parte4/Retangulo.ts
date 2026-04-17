class Retangulo {
    constructor(public base: number, public altura: number) {}
  
    calcularArea(): number {
      return this.base * this.altura;
    }
  
    calcularPerimetro(): number {
      return 2 * (this.base + this.altura);
    }
  }