public class Campanha {
    String nome;
    Personagem personagens;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
}


/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// #include <iostream>
// #include <string>
// #include <vector>

// class Personagem{
//     std::string nome;
    
//     public:
//     void setNome(std::string nome)
//     {this->nome = nome;}
    
//     std::string getNome()
//     {return this->nome;}
// };

// class Campanha{
//     std::string nome;
//     std::vector<Personagem> personagens;
    
//     public:
//     void setNome(std::string nome)
//     {this->nome = nome;}
    
//     std::string getNome()
//     {return this->nome;}
    
//     void setPersonagem(Personagem objPersonagem)
//     {this->personagens.push_back(objPersonagem);}
    
//     //Ponteiro para retornar o endereco da colecao
//     std::vector<Personagem>* getPersonagem()
//     {return &(this->personagens);}
// };

// class Usuario{
//     std::string nome;
//     Campanha campanha;
    
//     public:
//     void setNome(std::string nome)
//     {this->nome = nome;}
    
//     std::string getNome()
//     {return this->nome;}
    
//     void setCampanha(Campanha campanha)
//     {this->campanha = campanha;}
    
//     Campanha getCampanha()
//     {return this->campanha;}
// };

// int main()
// {
//     printf("Hello World");

//     return 0;
// }