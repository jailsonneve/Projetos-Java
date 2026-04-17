function somar(a: number, b: number): number {
  return a + b;
}

function subtrair(a: number, b: number): number {
  return a - b;
}

function multiplicar(a: number, b: number): number {
  return a * b;
}

function dividir(a: number, b: number): number {
  if (b === 0) {
    throw new Error("Não é possível dividir por zero");
  }
  return a / b;
}

function EnviarMSG(msg: string){
  console.log(msg);
}

function ehPar(numero:number) {
  if (numero%2 == 0) {
    return true;
  }
  else{
    return false
  }
}