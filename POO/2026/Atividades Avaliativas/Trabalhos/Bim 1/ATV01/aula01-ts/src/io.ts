import readline from "readline";

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

export function perguntar(texto: string): Promise<string> {
  return new Promise((resolve) => {
    rl.question(texto, (resposta) => {
      resolve(resposta);
    });
  });
}

export function fecharIO(): void {
  rl.close();
}

// ===== MODO DEMO =====
if (require.main === module) {
  (async () => {
    try {
      const nome = await perguntar("Digite seu nome: ");
      const idade = await perguntar("Digite sua idade: ");

      console.log(`Nome: ${nome}, Idade: ${idade}`);
    } catch (erro) {
      console.error("Erro:", erro);
    } finally {
      fecharIO();
    }
  })();
}