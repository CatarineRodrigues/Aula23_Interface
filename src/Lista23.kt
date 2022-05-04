/*Exercícios - Interface

1. Crie um programa que faça o calculo da área de figuras geometricas ( quadrado, retangulo,
triangulo, etc. ). Este projeto deve fazer criar uma interface para o calculo da area da figura
geometrica e deve ter varias classes que façam o calculo da area e que implementem a interface.
O programa deve ter um menu que mostre as figuras ( quadrado, retangulo, triangulo, losango e fim ).
De acordo com a opção, o programa de instanciar um objeto da classe correspondente e chamar o metodo que
calcula a area, passando os parametros que forem necessarios e que devem ser informados pelo teclado.

2. Definir e inicializar uma nova lista vazia. Adicionar os seguintes elementos à lista vazia:
[1,5,5,6,7,8,8,8]. Imprimir o resultado na tela.

3. Definir e inicializar um novo conjunto vazio. Adicionar os seguintes elementos ao conjunto
vazio: {1,5,5,6,7,8,8,8}. Imprimir o resultado na tela.
Qual é a diferença entre este exercício e o anterior?

4. Criar um dicionário que represente os objetos e suas cores. Para isso, o dicionário deverá ter
como chave String e como valor uma lista de Strings.
Exemplo dos valores:
bola -> azul
boneca -> amarela
dado -> rosa

Em seguida crie umarquivo com seu método main, imprimir no Main todas as chaves junto com seus
valores associados. Para isso, utilizar o foreach com as chaves.

5. Nosso banco precisa tributar dinheiro de alguns bens que nossos clientes possuem. Para isso,
vamos criar uma interface para o calculo dos tributos. Lemos essa interface da seguinte maneira:
"todos que quiserem ser tributável precisam saber calcular tributos, devolvendo um double".
Alguns bens são tributáveis e outros não,
a. ContaPoupanca não é tributável
b. já para ContaCorrente você precisa pagar 1% da conta
c. SeguroDeVida tem uma taxa fixa de 42 reais.

Escreva classes que implementem esta interface e calculem o tributo de acordo com a regra de negócio acima.

6. Crie a seguinte hierarquia de classes:
● Uma interface para representar qualquer forma geométrica, definindo métodos para cálculo do
perímetro e cálculo da área da forma;
● Uma classe abstrata para representar quadriláteros. Seu construtor deve receber os tamanhos dos
4 lados e o método de cálculo do perímetro já pode ser implementado;
● Classes para representar retângulos e quadrados. A primeira deve receber o tamanho da base e da
altura no construtor, enquanto a segunda deve receber apenas o tamanho do lado;
● Uma classe para representar um círculo. Seu construtor deve receber o tamanho do raio.
● No programa principal, pergunte ao usuário quantas formas ele deseja criar.
● Em seguida, para cada forma, pergunte se deseja criar um quadrado, um retângulos ou um círculo,
solicitando os dados necessários para criar a forma. Todas as formas criadas devem ser armazenadas
em um vetor.

● Finalmente, imprima:
○ (a) os dados (lados ou raio);
○ (b) os perímetros;
○ e (c) as áreas de todas as formas.
○ Para (b) e (c), tire vantagem do polimorfismo*/