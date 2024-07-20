#include <vector>
#include <string>
using namespace std;

class NomedaClasse{
    int atributo1;
    vector<float> atributo2;
    OutraClasse obj;
    
    //Contrutor padrao - Atençao aos valores iniciais, eles podem ser ou nao pre definidos
    NomedaClasse(){
        atr_int = 0;
        atr_float = 0.0f;
        atr_double = 0.0;
        atr_char = '';
        atr_bool = false;
        obj = OutraClasse(); //Uma variavel de classe recebe automaticamente o construtor da classe (Construtor de OutraClasse)
    }

    //Destruidor (~) - Não altera o cabeçalho, verificar quais os recursos que devem ser liberados
    ~NomedaClasse(){

    }

    //Cabeçalho ou 
    void metodo1();
    float metodo2(string param);

    //Getters e Setters serao abordados mais a frente
}