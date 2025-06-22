import java.util.Random;

public class Main {
  public static void main(String[] args) {
    System.out.println("SEMonster!");

    // Monsterクラスのインスタンスを生成して表示
    Monster monster = new Monster();
    System.out.println(monster);
  }
}

class Monster {
  String name;
  int rare; // 1:normal,2:uncommon,3:rare,4:ultra rare

  Monster() {
    Random random = new Random();
    this.name = this.summonMonster(random.nextInt(5));
    this.rare = random.nextInt(5);
  }

  String summonMonster(int mnumber) {
    String[] monsters = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }
}