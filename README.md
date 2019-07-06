# filesecutiryspringboot

## maven core


~~~
AppledeiMac:~ Apple$ cd ~/.ssh
AppledeiMac:.ssh Apple$ ls
id_rsa        id_rsa.pub  known_hosts
AppledeiMac:.ssh Apple$ ssh-keygen -t rsa -C "iMac_personnal_publicKey"
Generating public/private rsa key pair.
Enter file in which to save the key (/Users/Apple/.ssh/id_rsa):               
/Users/Apple/.ssh/id_rsa_personal
Enter passphrase (empty for no passphrase): 
Enter same passphrase again: 
Your identification has been saved in /Users/Apple/.ssh/id_rsa_personal.
Your public key has been saved in /Users/Apple/.ssh/id_rsa_personal.pub.
The key fingerprint is:
SHA256:1gepuxDHwJRnFbKvc0Zq/NGrFGE9kEXS06jxatPPrSQ iMac_personnal_publicKey
The key's randomart image is:
+---[RSA 2048]----+
|      ....=*oo   |
|     o. ooo=+ .  |
|      oo. =+o.   |
|       o =.o..   |
|      . S =o.    |
|       = =++.    |
|      . B.=.Eo.. |
|       o B . +o .|
|          . o.. .. |
+----[SHA256]-----+
AppledeiMac:.ssh Apple$ ls
id_rsa            id_rsa_personal     known_hosts
id_rsa.pub        id_rsa_personal.pub`
~~~


## then
> 打开新生成的~/.ssh/id_rsa2.pub文件，将里面的内容添加到GitHub后台。