import { perguntar, fecharIO } from "./io";
import {
  obrigatorio,
  parseNumeroInteiro,
  entre,
} from "./validators";

type Turma = "1TADS" | "2TADS" | "3TADS";

interface Aluno {
  nome: string;
  idade: number;
  turma: Turma;
}

(async () => {
  console.log("=== Cadastro de Aluno (CLI) ===");

  try {
    const nome = obrigatorio(await perguntar("Nome: "), "Nome");

    const idade = entre(
      parseNumeroInteiro(await perguntar("Idade: "), "Idade"),
      0,
      120,
      "Idade"
    );

    const turmaInput = obrigatorio(
      await perguntar("Turma (1TADS, 2TADS, 3TADS): "),
      "Turma"
    );

    const turmasValidas: Turma[] = ["1TADS", "2TADS", "3TADS"];

    if (!turmasValidas.includes(turmaInput as Turma)) {
      throw new Error("Turma deve ser: 1TADS, 2TADS ou 3TADS");
    }

    const aluno: Aluno = {
      nome,
      idade,
      turma: turmaInput as Turma,
    };

    console.log("Aluno cadastrado com sucesso:");
    console.log(aluno);
  } catch (erro: any) {
    console.error("Erro:", erro.message);
  } finally {
    fecharIO();
  }
})();