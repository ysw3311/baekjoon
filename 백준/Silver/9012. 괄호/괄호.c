
#include <stdio.h>
#include <string.h>

int main() {
    int p;
    char str[51];
    scanf("%d", &p);
    getchar(); 

    for (int i = 0; i < p; i++) {
        scanf("%s", str);

        int balance = 0; 

        int isValid = 1;
        for (int j = 0; j < strlen(str); j++) {
            if (str[j] == '(') {
                balance++;
            } else if (str[j] == ')') {
                balance--;
                if (balance < 0) { 
                    isValid = 0;
                    break;
                }
            }
        }

        if (isValid && balance == 0) {
            printf("YES\n");
        } else {
            printf("NO\n");
        }
    }

    return 0;
}
