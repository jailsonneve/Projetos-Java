let ativo: boolean = true;
let idade: number = 20;
let nome: string = "Lucas";

let notas: number[] = [8, 9.5, 7];
let tags: Array<string> = ["POO", "TypeScript", "IFPR"];

let coordenada: [number, number] = [25.40, -54.00];

enum Perfil {
    ADM = "ADM",
    USER = "USER"
};

let perfil: Perfil = Perfil.USER;



console.log(ativo, idade, nome);
console.log(notas, tags);
console.log(coordenada);
console.log(perfil);
