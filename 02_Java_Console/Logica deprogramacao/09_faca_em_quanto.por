programa {
  funcao inicio() {
    // declaração de variaveis 
    inteiro opcao
    real x,y, result
    // loop fac enquanto
    faca
    {
      //TODO  para fazer 
      escreva("\n1 - Soma \n")
      escreva("2 - Subtração\n")
      escreva("3 - Multiplicação \n")
      escreva("4 - Divisão \n")
      escreva("5 - Sair do programa \n")
      escreva("Informe a opção desejada:")
      leia(opcao)

      // verifica se o usurario preisa sair ou nao 
    
      se(opcao >= 1 e opcao <= 4)
      {
      escreva("Informe o valor de x:")
      leia(x)
      escreva("informe o valor de y :")
      leia(y)
    }
      // escolha caso 
      // verifica a opção scolhida
      escolha(opcao)
      {
        caso 1:
          result = x+y
          escreva("Resultado:" , result)
          pare
        caso 2:
          result = x-y
          escreva("Resultado:" , result)
          pare
        caso 3:
          result = x*y
          escreva("Resultado:" , result)
          pare
        caso 4:
          result = x/y
          escreva("Resultado:" , result)
          pare
        caso 5: 
          escreva("Programa encerrado.")
          
      }

    } enquanto (opcao !=5)

  }
}
