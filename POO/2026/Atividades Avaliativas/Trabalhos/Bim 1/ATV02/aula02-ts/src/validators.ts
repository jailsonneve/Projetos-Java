export function obrigatorio(valor: string, campo: string): string {
    const v = valor.trim();
    if (!v) throw new Error(`Campo obrigatório: ${campo}`);
    return v;
}
  
export function parseNumeroInteiro(valor: string, campo: string): number {
    const n = Number(valor);
  
    if (isNaN(n)) throw new Error(`${campo} deve ser número`);
    if (!Number.isInteger(n))
      throw new Error(`${campo} deve ser inteiro`);
  
    return n;
}
  
export function entre(n: number, min: number, max: number, campo: string) {
    if (n < min || n > max)
      throw new Error(`${campo} deve estar entre ${min} e ${max}`);
  
    return n;
}