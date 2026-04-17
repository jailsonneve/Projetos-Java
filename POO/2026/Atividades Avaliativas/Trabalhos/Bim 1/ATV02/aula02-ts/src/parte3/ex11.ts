import { perguntar, fecharIO } from "../io";

(async () => {
  const nome = await perguntar("Nome: ");
  const idade = await perguntar("Idade: ");
  const cidade = await perguntar("Cidade: ");

  console.log(nome, idade, cidade);
  fecharIO();
})();