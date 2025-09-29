
//  o usuario recebe 2 numero
programa {
  funcao inicio() {
    // declaração de variaveis 
    inteiro opcao
    real x,y, resul
    // entrada de dados 
    escreva("Informe o valor de x:")
    leia(x)
    escreva("Informe o valor de y:")
    leia(y)

    escreva("1 - Soma.")
    escreva("2 - Subtração .")
    escreva("3 - Multiplicação.")
    escreva("4 - Divisão.")
    escreva("Informe a opção desejada:")
    leia(opcao)

     // escolha caso
      escolha(opcao)
      {
      caso 1:
      result = x+y
      escreva("O resultado é" , result)
      pare
      caso 2:
      result = x-y
      escreva("O resultado é" , result)
      pare
      caso 3:
      result = x*y
      escreva(" O resultado é " , result)
      pare
      caso 4:
      result = x/y
      escreva("O Resultado é", result)
      pare
      caso contrario:
      escreva("Opçãoinvalida")
      }
 
  }
}
