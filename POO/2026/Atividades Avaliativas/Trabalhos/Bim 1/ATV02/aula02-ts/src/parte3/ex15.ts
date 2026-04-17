import { perguntar, fecharIO } from "../io";

function validarIdade(valor: string): number {
  const idade = Number(valor);

  if (isNaN(idade)) {
    throw new Error("Idade deve ser um número");
  }

  if (!Number.isInteger(idade)) {
    throw new Error("Idade deve ser inteira");
  }

  if (idade < 0 || idade > 120) {
    throw new Error("Idade deve estar entre 0 e 120");
  }

  return idade;
}

(async () => {
  try {
    const idade = validarIdade(await perguntar("Idade: "));

    console.log("Idade válida:", idade);
  } catch (e: any) {
    console.log("Erro:", e.message);
  } finally {
    fecharIO();
  }
})();