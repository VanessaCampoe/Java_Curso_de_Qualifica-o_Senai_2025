//  represenar um evento q vai ativar minha ação chmada submiti
// function arrowFunction eventListener
 
//  criar variavel em js  pode var .. let ... const constante o valor nao muda depois do progrma nao sendo mutavel 
const form = document.querySelector("form"); //  querySelector  seleciona o elemento do html // form nao e um apalavra resevada  , nao  tem necessidade de fazer a tipagem tipo do dado 
//  o document e o dom  (document object model) abrir o paramentro que  pode ser o id da teg 
// name ou class ou nome da class  aqui usando o nome da class
//  suporta aspas duplas ou simples 
//  criar uma função que vai atiar quando cricar no botao 
// arrowFunction criar uma fun~ção e atribuir a uma variavel 
const msg = () => {
    //  variaveis locais 
    let nome = document.querySelector("#nome").value; //  o value  pega o valor digitado no input
    let idade = document.querySelector("#idade").value;
    const result = (idade >= 18) ?  "é maior de idade!" :  "é menor de idade!";
    document.querySelector("#result").innerHTML = `Olá ${nome}, você ${result}`;


    // // varificar  a idade 
    // if (idade >= 18) {
    //     result = `Olá ${nome}, você é maior de idade!`; // crase nao e aspas 

    // }
    // else {
    //     result = `Olá ${nome}, você é menor de idade!`;
    // }

}
// evento 
form.addEventListener("submit", function(event) { //  o event  e um parametro  //  o submit  e o nome do evento
    // desativa
    event.preventDefault(); //  evitar o comportamento padrão do form
    // executa a função 
    msg(); //  chamar a função
});