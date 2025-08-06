programa {
  funcao inicio() {
    // declaraçãode variaveis 
    cadeia nome,genero
    inteiro idade
   


    // entrada de dados 
    escreva("informe seu nome:")
    leia(nome)
    escreva("Informe sua idade:")
    leia(idade)
    escreva(" Inofrme seu gênero :")
    leia(genero)

      //estrutura de decisão 


    se (idade >= 65 e genero == "masculino" ou idade >= 62  e genero == "feminino") escreva(nome,  " Aposentadoria autorizada")
    senao escreva(nome, "Aposenatoria não autorizada.") 
      
      
  
 }
}
