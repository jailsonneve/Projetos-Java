import { perguntar, fecharIO } from "../io";

function validarInteiro(valor: string): number {
  const n = Number(valor);

  if (isNaN(n)) {
    throw new Error("Valor deve ser um número");
  }

  if (!Number.isInteger(n)) {
    throw new Error("Valor deve ser um número inteiro");
  }

  return n;
}

(async () => {
  try {
    const numero = validarInteiro(await perguntar("Digite um número: "));

    console.log("Número válido:", numero);
  } catch (e: any) {
    console.log("Erro:", e.message);
  } finally {
    fecharIO();
  }
})();