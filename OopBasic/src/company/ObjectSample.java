package company;

public class ObjectSample {

    public static void main(String[] args) {
        // インスタンスの作成
        var department = new Department("営業部", "xx", 1000000);
        var employee = new Employee("鈴木", department, "課長", 100);

        // インスタンスメソッドの呼び出し
        employee.report();
        employee.report(2);
        employee.joinMeeting();

        // 1行空ける
        System.out.println("");

        // インスタンスの作成
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Engineer("田中", devDepartment, "一般社員", 88, "Java");

        // インスタンスメソッドの呼び出し
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();

        // 1行空ける
        System.out.println("");

        // ポリモーフィズムの確認
        Employee projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");

        // インスタンスメソッドの呼び出し
        projectManager.report();
        projectManager.joinMeeting();
        if (projectManager instanceof Engineer) {
            // developSoftwareメソッドを呼び出す
            ((Engineer) projectManager).developSoftware();
        }

        // ----- 追記（ここから） -----
        // 1行空ける
        System.out.println("");

        // アルバイトインスタンスの作成
        var parttimeWorker = new ParttimeWorker("太田", department);
        
        // 実装したメソッドの呼び出し
        ((Workable) employee).work();
        ((Workable) engineer).work();
        ((Workable) projectManager).work();
        ((Workable) parttimeWorker).work();
        // ----- 追記（ここまで） -----

    }

}