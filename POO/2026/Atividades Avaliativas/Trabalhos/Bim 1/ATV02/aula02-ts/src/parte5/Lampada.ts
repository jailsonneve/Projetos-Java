class Lampada {
    private ligada: boolean = false;
  
    ligar() {
      this.ligada = true;
    }
  
    desligar() {
      this.ligada = false;
    }
  
    estaLigada(): boolean {
      return this.ligada;
    }
  }
  
  // teste
  const lamp = new Lampada();
  lamp.ligar();
  console.log("Ligada?", lamp.estaLigada());
  lamp.desligar();
  console.log("Ligada?", lamp.estaLigada());