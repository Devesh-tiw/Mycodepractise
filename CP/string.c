#include<stdio.h>
#include<stdlib.h>
int main(){
    int  S_size;
    char *String;
    printf("Enter the String_size : ");
    scanf("%d",&S_size);
    String=(char*)malloc(S_size*sizeof(char));
    if(String==NULL){
        printf("Memory Allocation is failed ");
        return 1;
    }
  
        scanf("%s",String);

        printf("%s", String);
    
}