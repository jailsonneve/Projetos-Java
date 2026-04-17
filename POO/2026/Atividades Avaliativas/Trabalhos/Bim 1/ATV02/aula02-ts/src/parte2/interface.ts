type Turma = "1TADS" | "2TADS" | "3TADS";

interface Aluno {
  id: number;
  nome: string;
  ativo: boolean;
}

function matricular(aluno: Aluno, turma: Turma, ativo: boolean) {
  console.log(aluno.nome, turma, ativo);
}