// variaveis globais 
const btn = document.querySelector('form');
const telefoneMask = document.querySelector('#telefone');
const cepMask = document.querySelector('#cep');
const pesquisaCep = document.querySelector('#cep');

//  constante pq nao muda o let posso mudar e vale para um trecho especifico


// arrow function
const limpa_formulario_cep = () => {
    // limpa 
    document.querySelector("#estado").value = ("");
    document.querySelector("#cidade").value = ("");
    document.querySelector("#bairro").value = ("");
    document.querySelector("#logadouro").value = ("");
}
const meu_callback = (conteudo) => {
    if (!(" erro " in conteudo)) {
        document.querySelector("#estado").value = (conteudo.uf);
        document.querySelector("#cidade").value = (conteudo.localidade);
        document.querySelector("#bairro").value = (conteudo.bairro);
        document.querySelector("#logadouro").value = (conteudo.locadouro);
    }
    else {
        // cep não encontrado 
        limpa_fprmulario_cep();
        alert("Cep não encpntrado.");
//  aqui ele limpa todos os dados do cep no outro se ele char o dado e muda tudo 
    }
}
// eventos
pesquisaCep.addEventListener('blur', function() {
    // cep somente som digitos
    let cep = valor.replace(/\D/g,''); // eleiminando qualquer caracterer se estive r nullo 
    //  cep  tem valor inofrmado 
    if (cep != "") {
        //  variavel de validação cep 
        let validarCep = /^[0-9]{8}$/;
        // valida cep 
        if (validarCep.test_cep()){
            document.querySelector('#estado').value = "..."
            document.querySelector("#cidade").value = "..."
            document.querySelector("#bairro").value = "..."
            document.querySelector("#logadouro").value = "..."
            //  aqui ele le com ou sem espaço no = 
            //  cria um elemnto js 
            let script = document.createElement('script');

            //  sincroniza o callback 
            script.src = 'https://viacep.com.br/ws/' +cep + '/json/?callback=meu_callback';

            // inseri o script do conteudo  e carrega o conteudo 
            document.body.appendChild(script);

        }
        else {
            limpa_formulario_cep();
            alert("Formato de CEP inavalido.")

        }
    


    }
    else {
        // .limpar formulario 
        limpa_formulario_cep();
    }
});



telefoneMask.addEventListener('input', function(){
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{2})(\d)/, '($1) $2')
        .replace(/(\d{4,5})(\d)/, '$1-$2')
        .replace(/(-\d{4})\d+?$/, '$1');
});

cepMask.addEventListener('input', function(){
    this.value = this.value 
        .replace(/\D/g, '')
        .replace(/(\d{5})(\d)/, '$1-$2')
        .replace(/(-\d{3})\d+?$/, '$1');
});

btn.addEventListener('submit', function(event){
    event.preventDefault();

    // Declarar variáveis:
    let nome = document.querySelector('#nome').value;
    let telefone = document.querySelector('#telefone').value;
    let cep = document.querySelector('#cep').value;
    let estado = document.querySelector('#estado').value;
    let cidade = document.querySelector('#cidade').value;
    let bairro = document.querySelector('#bairro').value;
    let logradouro = document.querySelector('#logradouro').value;
    let complemento = document.querySelector('#complemento').value;
    let numero = document.querySelector('#numero').value;

    // Dados variáveis:
    let dados = `Dados do usuário: <br><br>
                Nome: ${nome}<br>
                Telefone: ${telefone}<br>
                CEP: ${cep}<br>
                Estado: ${estado}<br>
                Cidade: ${cidade}<br>
                Bairro: ${bairro}<br>
                Logradouro: ${logradouro}<br>
                Complemento: ${complemento}<br>
                Número: ${numero}<br>
                `;

    document.querySelector('#dados').innerHTML = dados;
});