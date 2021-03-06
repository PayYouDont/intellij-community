from typing import Any, Callable, Optional, Sequence, TypeVar

_T = TypeVar("_T")

_F = TypeVar("_F", bound=Callable[..., Any])
_RET = Callable[[_F], _F]

def lfu_cache(maxsize: float = ..., typed: bool = ...) -> _RET[_F]: ...
def lru_cache(maxsize: float = ..., typed: bool = ...) -> _RET[_F]: ...
def rr_cache(maxsize: float = ..., choice: Optional[Callable[[Sequence[_T]], _T]] = ..., typed: bool = ...) -> _RET[_F]: ...
def ttl_cache(maxsize: float = ..., ttl: float = ..., timer: float = ..., typed: bool = ...) -> _RET[_F]: ...
