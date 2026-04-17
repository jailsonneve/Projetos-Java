class Conta {
    private saldo: number = 0;
  
    depositar(v: number) {
      if (v > 0) this.saldo += v;
    }
  
    consultar() {
      return this.saldo;
    }
  }