public interface ICommand {
    public void execute(int temperature);
    public void undo();
}
