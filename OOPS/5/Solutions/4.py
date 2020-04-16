'''
We need to write the function to check the password entered is correct or not based on the following
conditions.
a) It must have atleast one lower case character and one digit.
b) It must not have any Upper case characters and any special characters
#c) length should be b/w 5-12.
d) It should not have any same immediate patterns like
abcanan1 : not acceptable coz of an an pattern
abc11se: not acceptable, coz of pattern 11
123sd123 : acceptable, as not immediate pattern
adfasdsdf : not acceptable, as no digits
Aasdfasd12: not acceptable, as have uppercase character
'''

while True:
    passwd = input('Password: ')
    lowBit = False
    digBit = False
    if len(passwd) < 5 and len(passwd) > 12:
        print('not accepted')
        continue
    for ch in passwd:
        if ch.isupper() or ch in ['~', ':', "'", '+', '[', '\\', '@', '^', '{', '%', '(', '-', '"', '*', '|', ',', '&', '<', '`', '}', '.', '_', '=', ']', '!', '>', ';', '?', '#', '$', ')', '/']:
            print('not accepted')
            continue
        if ch.islower():
            lowBit = True
        elif ch.isdigit():
            digBit = True
    if digBit == False or lowBit == False:
        print('not accepted')
        continue
    br = False
    for i in range(len(passwd)-1):
                  for j in range(i,len(passwd)):   #from i onwards
                      pre = passwd[i:j+1]
                      post = passwd[j+1:]
                      '''
The index() method is similar to find() method for strings. The only difference is that find() method returns -1 if the substring is not found, whereas index() throws an exception.
'''
                      if post.find(pre) == 0:
                          print('not accepted : repeat',pre)
                          br = True
                          break
                  if br == True:
                    break
                    
                                  
                       
            

            
            
        
