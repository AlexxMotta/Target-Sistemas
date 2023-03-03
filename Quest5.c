






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

