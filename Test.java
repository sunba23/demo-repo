class Test
{
    int add (int a, int b)
    {
        return a + b;
    }

    int a = 3;
    int b = 4;

    public static void main(String[] args)
    {
        Test t = new Test();
        System.out.println(t.add(t.a, t.b));
    }
}