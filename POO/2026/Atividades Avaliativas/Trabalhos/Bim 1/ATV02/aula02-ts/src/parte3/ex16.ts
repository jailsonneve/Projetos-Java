import { perguntar, fecharIO } from "../io";
import { obrigatorio, parseNumeroInteiro, entre } from "../validators";

(async () => {
  try {
    const nome = obrigatorio(await perguntar("Nome: "), "Nome");

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

    console.log({ nome, idade, nota });
  } catch (e: any) {
    console.log("Erro:", e.message);
  } finally {
    fecharIO();
  }
})();