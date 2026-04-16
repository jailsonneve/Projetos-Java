import { perguntar, fecharIO } from "./io";

// Campo obrigatório
export function obrigatorio(valor: string, nomeCampo: string): string {
  const v = valor.trim();

  if (!v) {
    throw new Error(`Campo obrigatório: ${nomeCampo}`);
  }

  return v;
}

// Converter para inteiro
export function parseNumeroInteiro(valor: string, nomeCampo: string): number {
  const v = obrigatorio(valor, nomeCampo);

  const numero = Number(v);

  if (isNaN(numero)) {
    throw new Error(`${nomeCampo} deve ser um número válido`);
  }

  if (!Number.isInteger(numero)) {
    throw new Error(`${nomeCampo} deve ser um número inteiro`);
  }

  return numero;
}

// Validar intervalo
export function entre(
  n: number,
  min: number,
  max: number,
  nomeCampo: string
): number {
  if (n < min || n > max) {
    throw new Error(`${nomeCampo} deve estar entre ${min} e ${max}`);
  }

  return n;
}

// ===== MODO DEMO =====
if (require.main === module) {
  (async () => {
    try {
      const nome = obrigatorio(await perguntar("Nome: "), "Nome");

      const idade = entre(
        parseNumeroInteiro(await perguntar("Idade: "), "Idade"),
        0,
        120,
        "Idade"
      );

      console.log("Dados válidos:", { nome, idade });
    } catch (erro: any) {
      console.error("Erro:", erro.message);
    } finally {
      fecharIO();
    }
  })();
}