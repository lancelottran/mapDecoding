int mapDecoding(String message) {
    if(message.length() == 0)
        return 1;
    
    int prev = 0, count = 0, curr = 1;
    
    for(int i = 0 ; i < message.length(); i++){
        int digit = message.charAt(i) - '0';
        int num = 0;
        
        if(i > 0)
            num = (message.charAt(i-1) - '0')*10 + digit;
        
        if(digit > 0)
            count = curr;
        
        if(num < 27 && num > 9) count += prev;
        prev = curr;
        curr = count % 1000000007;
        count = 0;
    }
    
    return curr;
}
