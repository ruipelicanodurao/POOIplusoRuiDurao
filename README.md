# POOIplusoRuiDurao

### Exercicio 1 - Rodrigo Martins 

## How to run

You have two easy options:

- IntelliJ IDEA (recommended)
- Command line (Windows cmd.exe)

### 1) IntelliJ IDEA
1. Install a JDK (17 or 21). A good option is Adoptium Temurin: https://adoptium.net/
2. In IntelliJ, go to File > Project Structure > Project, and set:
   - Project SDK: your installed JDK
   - Project language level: matches the JDK
3. Open `src/Main.java` and click the green run icon next to `public static void main` or press Shift+F10.

### 2) Command line (cmd.exe)
1. Ensure `javac` and `java` are on PATH:
   - Press Win+R, type `cmd`, press Enter.
   - Run `javac -version` and `java -version`. If they are not found, install a JDK and add its `bin` folder to PATH.
2. From the project folder, run the helper script:

   run.bat

This will compile `src/Main.java` into `out/` and run the `Main` class.

### Common issues
- Filename vs class name: In Java, the public class name must match the file name exactly (case-sensitive). Here it's `Main` in `Main.java`.
- JDK vs JRE: You need a JDK (with `javac`), not just a JRE.
- PATH: After installing the JDK, reopen your terminal so PATH updates.
