
const cpfMask = document.querySelector('#cpf')
const telefoneMask = document.querySelector('#telefone')
const cepMask = document.querySelector('#cep')
const form = document.querySelector('form')
//  # significa q estou me referindo a um id 
//  o form nao em um id por ser 

const btn = () => {
    let nome = document.querySelector('#nome').value;
    let cpf = document.querySelector('#cpf').value;
    let telefone = document.querySelector('#telefone').value;
    let cep = document.querySelector('#cep').value;
    let result = `Nome : ${nome}.<br>
                    CPF: ${cpf}.<br>
                    Telefone: ${telefone}.<br>
                    CEP: ${cep}.<br>
                    
    `
document.querySelector('#result').innerHTML = result;

}

cpfMask.addEventListener('input', function() {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d{1,2})$/, '$1-$2');
});
    //  fleg g global 
    //   subistitui tudo que nao for caracter D subistiui letras por numeros

// O que faz .replace(/\D/g, '')?

// Essa expressão em JavaScript remove todos os caracteres que não são dígitos (números) de uma string.

// Detalhes:

// .replace(...): método que substitui parte de uma string.

// /\D/g: é uma expressão regular (regex).

// \D significa "qualquer caractere que não seja um dígito" (ou seja, tudo que não for 0–9).

telefoneMask.addEventListener('input', function() {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{2})(\d)/, '($1) $2')
        .replace(/(\d{4,5})(\d)/, '$1-$2')
        .replace(/(-\d{4})\d+?$/, '$1');
});
    //  sifrão e sequencia 

cepMask.addEventListener('input', function() {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{5})(\d)/, '$1-$2')
        .replace(/(-\d{3})\d+?$/, '$1');
        
});

form.addEventListener('submit', function(event) {
    event.preventDefault();
    btn();
});


// 👉 Isso é input masking: usar replace() com expressões regulares para formatar um valor em tempo real.
