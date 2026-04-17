import { perguntar, fecharIO } from "../io";
import { obrigatorio, parseNumeroInteiro, entre } from "../validators";

class Aluno {
  constructor(
    public nome: string,
    public matricula: number,
    public idade: number,
    public nota: number
  ) {}

  situacao() {
    return this.nota >= 6 ? "Aprovado" : "Reprovado";
  }
}

(async () => {
  try {
    const nome = obrigatorio(await perguntar("Nome: "), "Nome");

    const matricula = parseNumeroInteiro(
      await perguntar("Matrícula: "),
      "Matrícula"
    );

    const idade = entre(
      parseNumeroInteiro(await perguntar("Idade: "), "Idade"),
      0,
      120,
      "Idade"
    );

    const nota = entre(
      parseNumeroInteiro(await perguntar("Nota: "), "Nota"),
      0,
      10,
      "Nota"
    );

    const aluno = new Aluno(nome, matricula, idade, nota);

    console.log(aluno);
    console.log("Situação:", aluno.situacao());
  } catch (e: any) {
    console.log("Erro:", e.message);
  } finally {
    fecharIO();
  }
})();