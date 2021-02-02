# JavaCertChecker 

Small utility to check if java can communicate over https with some endpoint.

Usage:
`
java -jar JavaCertChecker.jar https://<webserver>"
`

For Example:

```
fedora:~:% java -jar JavaCertChecker.jar https://www.google.com
fedora:~:% echo $?
0

fedora:~:% java -jar JavaCertChecker.jar https://self-signed.badssl.com/ 2>/dev/null
fedora:~:% echo $?
1
```

