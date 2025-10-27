# Test - Analyse de nombre

Ce projet est un simple programme Java qui permet d'analyser un nombre pour déterminer :

1. Sa **parité** : pair ou impair  
2. Sa **positivité** : positif, négatif ou nul  


---

## Prérequis

- Java JDK 8 ou supérieur
- Un terminal ou IDE pour exécuter le programme

---

## Compilation et exécution

### Depuis le terminal

1. **Compiler le programme :**

```bash
javac Test.java
```
2. **Exécuter le programme sans argument :**

```bash
java Test
```
3. **Exécuter le programme avec argument :**

```bash
java Test 42
```

## Fonctionnement

Le programme fonctionne de la manière suivante :

1. Si aucun argument n’est fourni, il demande à l’utilisateur d’entrer un nombre.
2. Il détermine si le nombre est **positif**, **négatif** ou **nul** grâce à la méthode `positivity(int)`.
3. Il détermine si le nombre est **pair** ou **impair** grâce à la méthode `parity(int)`.
4. Il affiche le résultat dans le terminal.

**Exemple sans argument :**

```bash
Chiffre à tester : 
-5
-5 est négatif et impair
```

**Exemple avec argument :**

```bash
java Test 10
10 est positif et pair
```
---
## Méthodes principales

- `parity(int number)` : retourne `"pair"` si le nombre est pair, `"impair"` sinon.
- `positivity(int number)` : retourne `"positif"`, `"négatif"` ou `"nul"` selon le signe du nombre.