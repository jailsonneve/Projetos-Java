import { perguntar, fecharIO } from "../io";

function obrigatorio(valor: string, nomeCampo: string): string {
  const v = valor.trim();

  if (!v) {
    throw new Error(`Campo obrigatório: ${nomeCampo}`);
  }

  return v;
}

(async () => {
  try {
    const nome = obrigatorio(await perguntar("Nome: "), "Nome");

    console.log("Nome válido:", nome);
  } catch (e: any) {
    console.log("Erro:", e.message);
  } finally {
    fecharIO();
  }
})();