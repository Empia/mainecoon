/*
 * Copyright 2017 Kailuo Wang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package object mainecoon {
  type Tuple3K[F[_], G[_], H[_]] = { type l[T] = (F[T], G[T], H[T]) }
  type Tuple4K[F[_], G[_], H[_], I[_]] = { type l[T] = (F[T], G[T], H[T], I[T])}
  type Tuple5K[F[_], G[_], H[_], I[_], J[_]] = { type l[T] = (F[T], G[T], H[T], I[T], J[T])}
  type Tuple6K[F[_], G[_], H[_], I[_], J[_], K[_]] = { type l[T] = (F[T], G[T], H[T], I[T], J[T], K[T])}
  type Tuple7K[F[_], G[_], H[_], I[_], J[_], K[_], L[_]] = { type l[T] = (F[T], G[T], H[T], I[T], J[T], K[T], L[T])}
  type Tuple8K[F[_], G[_], H[_], I[_], J[_], K[_], L[_], M[_]] = { type l[T] = (F[T], G[T], H[T], I[T], J[T], K[T], L[T], M[T])}
  type Tuple9K[F[_], G[_], H[_], I[_], J[_], K[_], L[_], M[_], N[_]] = { type l[T] = (F[T], G[T], H[T], I[T], J[T], K[T], L[T], M[T], N[T])}
}
