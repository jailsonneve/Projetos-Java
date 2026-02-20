var ativo = true;
var idade = 20;
var nome = "Lucas";
var notas = [8, 9.5, 7];
var tags = ["POO", "TypeScript", "IFPR"];
var coordenada = [25.40, -54.00];
var Perfil;
(function (Perfil) {
    Perfil["ADM"] = "ADM";
    Perfil["USER"] = "USER";
})(Perfil || (Perfil = {}));
;
var perfil = Perfil.USER;
console.log(ativo, idade, nome);
console.log(notas, tags);
console.log(coordenada);
console.log(perfil);
