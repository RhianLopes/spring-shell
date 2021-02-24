# spring-shell

## :cyclone: Contexto

Este repositório tem como objetivo guardar e documentar o conhecimento adquirido ao pesquisar mais sobre [Spring Shell](https://spring.io/projects/spring-shell), inicialmente os conteúdos desse repositório serão apresentados nas reuniões de padrões internas do time no qual participo.

## :school_satchel: Introdução

O [Spring Shell](https://spring.io/projects/spring-shell) permite que possamos criar comandos de uma maneira super simples e descomplicada, esses mesmos comandos podem ser chamados via linha de comando pelo terminal. Toda a configuração para que isso aconteça, é muito simples e orientada a anotações, para saber mais e criar seu projeto, siga os passos abaixo.

## :mag_right: Criando seu projeto com Spring Shell

Para criar seu primeiro projeto utilizando Spring Shell, você pode criar um simples projeto via [Spring Initializr](https://start.spring.io/) ou utilizar algum projeto Spring já existente.

Com o projeto já criado, você deve acrescentar a dependência do [Spring Shell](https://spring.io/projects/spring-shell) em seu arquivo `pom.xml`, lembre de conferir a versão mais recente do [Spring Shell](https://spring.io/projects/spring-shell), para isso você pode conferir via [Maven Repository Spring Shell Starter](https://mvnrepository.com/artifact/org.springframework.shell/spring-shell-starter):

```xml
<dependency>
  <groupId>org.springframework.shell</groupId>
  <artifactId>spring-shell-starter</artifactId>
  <version>2.0.1.RELEASE</version>
</dependency>
```

Feito isso, já podemos utilizar todas as anotações e códigos disponibilzados do [Spring Shell](https://spring.io/projects/spring-shell), você pode rodar seu projeto e ao fim do processo de inicialização rodar o seguinte comando:

```
$ help
```
Como mostra a imagem abaixo:

![image](https://user-images.githubusercontent.com/47872242/108928379-d3d64c80-7620-11eb-8498-4a2382acb480.png)

Os comandos listados após rodar `help`, são alguns comandos que vêm por padrão com o [Spring Shell](https://spring.io/projects/spring-shell), logo você acaba de criar sua primeira aplicação utilizando [Spring Shell](https://spring.io/projects/spring-shell) :grin:!!!

## :chart_with_upwards_trend: Aprofundando um pouco em Spring Shell

Com sua aplicação já criada, podemos dar inicio a criação de nosso primeiro comando costumizado, para isso vamos criar uma pasta chamada `commands` e dentro da mesma criar uma classe java, chamada `PokemonCommands`.

Feito isso, devemos adicionar nossas primeiras configurações por meio de anotações:

```java
@ShellComponent
@ShellCommandGroup("Pokemon")
public class PokemonCommand {
    //...
}
```

A anotação `@ShellComponent` é necessária para referenciarmos que nossa classe representará um componente que conterá comandos Shell, já a anotação `@ShellCommandGroup("Pokemon")` representará o nosso grupo de comandos Pokemon.

Feitas as configurações da classe, partimos para as configurações do nosso método, que representará um comando shell:

```java
@ShellMethod("List pokemon")
public String listPokemon() {
    return "Your Pokemon List is Empty :/";
}
```

A anotação `@ShellMethod("List pokemon")` representara seu método shell que poderá ser executado, já a String passada na anotação representa a função do comando, já o comando em si, será formado pelo nome do método, no caso assima, o comando será `list-pokemon`.

Feito isso, podemos rodar nossa aplicação e rodar novamente o comando `help` para conferirmos nosso novo grupo e comando:

![image](https://user-images.githubusercontent.com/47872242/108929593-1ef15f00-7623-11eb-851a-8927dfb5cff6.png)

Com isso já podemos ver nosso grupo de comandos `Pokemon` e nosso comando `list-pokemon`, agora podemos rodar nosso comando `list-pokemon`:

![image](https://user-images.githubusercontent.com/47872242/108929752-5c55ec80-7623-11eb-95d2-66834ce2ced1.png)

Com isso, criamos nosso primeiro comando com Spring Shell!!, agora você pode fazer seus testes e evoluir sua aplicação. Neste mesmo repositório, você pode conferir o projeto criado para criar esse passo a passo, o mesmo já está um pouco mais evoluido contendo 3 métodos shell onde para buscar os dados do mesmos é consumida a [PokeApi](https://pokeapi.co/).

## :scissors: Conclusão

Fiquei impressionado com o [Spring Shell](https://spring.io/projects/spring-shell), pela sua simplicidade e ótima orientação a interfaces, em poucos minutos você pode adiciona-lo em seu projeto, sendo uma ótima opção para quem necessidade de uma solução que utilize comandos shell.
