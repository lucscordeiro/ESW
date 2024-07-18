#include <vector>
#include <string>
using namespace std;

//Encapsulamento
class NomedaClasse{
    public: 
    int atributo1;
    
    private: 
    vector<float> atributo2;
    
    protected: 
    string atributo3;

    public:
    void metodo1();
    
    private:
    float metodo2(string param);

    //Getter - recuperar valor de um atributo
    public: 
    vector<float>* getAtributo2(){
        return &this->atributo2;
    }

    //Exemplo de organizacao
    // public: 
    // int atributo1;
    // void metodo1();

    //private - apenas a classe
    //public - todos
    //protected - classe e sub-classes

};

int main(){
    NomedaClasse obj;

    cout<<obj.getAtributo2()->size();
    cout<<vector <float>* x = obj.getAtributo2();

    return 0;
};