class GenericThrow<T extends Throwable> {
  T t;
  void x() throws <caret>Throwable {
    throw t;
  }
}