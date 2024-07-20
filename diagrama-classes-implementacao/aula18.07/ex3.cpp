#include <vector>
#include <string>
using namespace std;

//Membros estaticos
class NomedaClasse{
    private: 
    vector<float> atributo2;
    
    protected: 
    string atributo3;

    public: 
    int atributo1;
    static bool atributo4; //Atributo estatico, cria um espaco estatico na memoria
    void metodo1();
    
    private:
    float metodo2(string param);
};

//Inicializar atributo estatico
bool NomedaClasse::atributo4 = false;

int main(){
    NomedaClasse obj;
    
    //Acessando atributo estatico
    NomedaClasse::atributo4;

    return 0;
};