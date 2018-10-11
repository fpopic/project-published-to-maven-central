https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html


1. Create your key
```
gpg --gen-key
```

output:

```
gpg: key AE369F81 marked as ultimately trusted
public and secret key created and signed.

gpg: checking the trustdb
gpg: 3 marginal(s) needed, 1 complete(s) needed, PGP trust model
gpg: depth: 0  valid:   2  signed:   0  trust: 0-, 0q, 0n, 0m, 0f, 2u
pub   2048R/AE369F81 2018-10-11
      Key fingerprint = 4F3E 773B 75D5 10A6 030F  CAFA D4EC 12FA AE36 9F81
uid                  Filip Popic (for maven) <filip.popic@gmail.com>
sub   2048R/FD5EC80F 2018-10-11
```

2. Check if the key is there
```
gpg --list-keys
```

output:
```
/home/fpopic/.gnupg/pubring.gpg
-------------------------------
pub   2048R/AE369F81 2018-10-11
uid                  Filip Popic (for maven) <filip.popic@gmail.com>
sub   2048R/FD5EC80F 2018-10-11
```

3. Setup build.sbt
```$xslt
useGpg := false
usePgpKeyHex(id = "D4EC12FAAE369F81")
pgpPublicRing := Path.userHome / ".gnupg" / "pubring.gpg"
pgpSecretRing := Path.userHome / ".gnupg" / "secring.gpg"
```

3. publish localy to your .ivy2 folder 
```
PGP_PASS="xxxxxx" sbt publishLocalSigned
```
