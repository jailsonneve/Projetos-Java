import { perguntar, fecharIO } from "../io";

(async () => {
  const a = Number(await perguntar("A: "));
  const b = Number(await perguntar("B: "));

  console.log("Soma:", a + b);
  fecharIO();
})();