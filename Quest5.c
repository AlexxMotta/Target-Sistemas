// Cada problema tem uma solução, como eu não poderia usar um metodo nativo do JS pra resolver fiz na mão
// com C mesmo, C é melhor pra manipular os dados assim.

#include <stdio.h>
int i =0;
void imprimeInverRec(char *s){
    
    if(s[0] !='\0'){
        i++;
        imprimeInverRec(&s[1]);
        printf("%c",s[0]);
    }
}

int main()
{
    imprimeInverRec("Junior");
    return 0;
}

